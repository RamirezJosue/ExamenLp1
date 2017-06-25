-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-06-2017 a las 23:05:55
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinicadental`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `analisis`
--

CREATE TABLE `analisis` (
  `idAnalisis` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `notivo_consulta` varchar(80) NOT NULL,
  `riesgo` varchar(80) NOT NULL,
  `estado` varchar(5) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `analisis`
--

INSERT INTO `analisis` (`idAnalisis`, `idPaciente`, `notivo_consulta`, `riesgo`, `estado`, `fecha`) VALUES
(1, 1, 'consulta', 'sadsd', '1', '2017-06-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `anamesis`
--

CREATE TABLE `anamesis` (
  `idAnamesis` int(11) NOT NULL,
  `idAnalisis` int(11) NOT NULL,
  `amenesis_pre1` varchar(1) NOT NULL,
  `amenesis_pre2` varchar(1) NOT NULL,
  `amenesis_pre3` varchar(1) NOT NULL,
  `ampliacion` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `anamesis`
--

INSERT INTO `anamesis` (`idAnamesis`, `idAnalisis`, `amenesis_pre1`, `amenesis_pre2`, `amenesis_pre3`, `ampliacion`) VALUES
(1, 1, '1', '1', '1', 'Pruebas de anamesis');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ant_quirurgico`
--

CREATE TABLE `ant_quirurgico` (
  `idAntquirurgico` int(11) NOT NULL,
  `idAnalisis` int(11) NOT NULL,
  `diabetes` varchar(5) NOT NULL,
  `tuberculosis` varchar(5) NOT NULL,
  `enfHepaticas` varchar(5) NOT NULL,
  `fiebrereumatica` varchar(5) NOT NULL,
  `enfRenal` varchar(5) NOT NULL,
  `enfCardiovascular` varchar(5) NOT NULL,
  `anemia` varchar(5) NOT NULL,
  `anesticiallocal` varchar(5) NOT NULL,
  `otrasdrogas` varchar(5) NOT NULL,
  `hemorragias` varchar(5) NOT NULL,
  `infecciones` varchar(5) NOT NULL,
  `alergiapenicylina` varchar(5) NOT NULL,
  `otros` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ant_quirurgico`
--

INSERT INTO `ant_quirurgico` (`idAntquirurgico`, `idAnalisis`, `diabetes`, `tuberculosis`, `enfHepaticas`, `fiebrereumatica`, `enfRenal`, `enfCardiovascular`, `anemia`, `anesticiallocal`, `otrasdrogas`, `hemorragias`, `infecciones`, `alergiapenicylina`, `otros`) VALUES
(1, 1, '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `idCitas` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `idTrabajo` int(11) NOT NULL,
  `idDoctor` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora_inicio` time NOT NULL,
  `hora_fin` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`idCitas`, `idPaciente`, `idTrabajo`, `idDoctor`, `fecha`, `hora_inicio`, `hora_fin`) VALUES
(1, 1, 1, 1, '2017-06-13', '10:00:00', '12:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_diagnostico`
--

CREATE TABLE `detalle_diagnostico` (
  `idDetallediagnostico` int(11) NOT NULL,
  `idDiagnostico` int(11) NOT NULL,
  `idDientes` int(11) NOT NULL,
  `estado` varchar(5) NOT NULL,
  `lado_v` varchar(10) NOT NULL,
  `lado_d` varchar(10) NOT NULL,
  `lado_m` varchar(10) NOT NULL,
  `lado_p` varchar(10) NOT NULL,
  `lado_c` varchar(10) NOT NULL,
  `estadoSituacion` varchar(5) DEFAULT NULL COMMENT 'ncrustacion--6=fractura dentaria--7=Surco Profundo',
  `accionrealizar` varchar(5) DEFAULT NULL COMMENT 'eza Coronada--5=Implantes--6=Lesion Cervical'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_tratamiento`
--

CREATE TABLE `detalle_tratamiento` (
  `idDetalleTratamiento` int(11) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `idDetallediagnostico` int(11) NOT NULL,
  `estado` varchar(5) NOT NULL,
  `lado_v` varchar(10) NOT NULL,
  `lado_d` varchar(10) NOT NULL,
  `lado_m` varchar(10) NOT NULL,
  `lado_p` varchar(10) NOT NULL,
  `lado_c` varchar(10) NOT NULL,
  `estadoSituacion` varchar(5) NOT NULL,
  `estadoAccion` varchar(5) NOT NULL,
  `igv` double NOT NULL,
  `precio` double NOT NULL,
  `importe` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnostico`
--

CREATE TABLE `diagnostico` (
  `idDiagnostico` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `estado` varchar(5) NOT NULL,
  `fecha` date NOT NULL,
  `descripcion` varchar(80) NOT NULL,
  `modelo_estudio` varchar(80) DEFAULT NULL COMMENT '--Montado en articulados--Sin montar',
  `otros` varchar(80) NOT NULL,
  `idDoctor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `diagnostico`
--

INSERT INTO `diagnostico` (`idDiagnostico`, `idPaciente`, `estado`, `fecha`, `descripcion`, `modelo_estudio`, `otros`, `idDoctor`) VALUES
(1, 1, '1', '2017-06-14', 'sdsdsdsd', 'x', 'x', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dientes`
--

CREATE TABLE `dientes` (
  `idDientes` int(11) NOT NULL,
  `imagen` varchar(60) NOT NULL,
  `codigo` varchar(4) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `tipoDiente` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `dientes`
--

INSERT INTO `dientes` (`idDientes`, `imagen`, `codigo`, `nombre`, `tipoDiente`) VALUES
(2, 'Diente2.jpg', 'D002', 'PreMolar', 'Adult'),
(4, 'Diente3.jpg', 'D003', 'Premolar', 'Adult'),
(5, 'Imgen5.jpg', 'D005', 'Pre Molar', 'Adult'),
(7, 'Diente07.jpg', 'D007', 'Molar 1', 'Adult'),
(8, 'Imagen07.jpg', 'D007', 'Insicivo', 'Adult');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctor`
--

CREATE TABLE `doctor` (
  `idDoctor` int(11) NOT NULL,
  `idPersona` int(11) NOT NULL,
  `numeroColegio` varchar(10) NOT NULL,
  `fechaAlta` date NOT NULL,
  `estado` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `doctor`
--

INSERT INTO `doctor` (`idDoctor`, `idPersona`, `numeroColegio`, `fechaAlta`, `estado`) VALUES
(1, 1, 'C001', '2017-06-07', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen_auxiliares`
--

CREATE TABLE `examen_auxiliares` (
  `idExamenAuxiliar` int(11) NOT NULL,
  `idAnalisis` int(11) NOT NULL,
  `rad_aletamordida` varchar(1) NOT NULL,
  `rad_pariapical` varchar(1) NOT NULL,
  `rad_panoramica` varchar(1) NOT NULL,
  `rad_oclusal` varchar(1) NOT NULL,
  `otros` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen_estomatologico`
--

CREATE TABLE `examen_estomatologico` (
  `idExamenestomatologico` int(11) NOT NULL,
  `idAnalisis` int(11) NOT NULL,
  `atm` varchar(10) NOT NULL,
  `ganglios` varchar(10) NOT NULL,
  `labios` varchar(10) NOT NULL,
  `vestibulo` varchar(10) NOT NULL,
  `paladarduroblando` varchar(20) NOT NULL,
  `lengua` varchar(10) NOT NULL,
  `piso_boca` varchar(10) NOT NULL,
  `periodonto` varchar(10) NOT NULL,
  `otros` varchar(20) NOT NULL,
  `ampliacion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `examen_estomatologico`
--

INSERT INTO `examen_estomatologico` (`idExamenestomatologico`, `idAnalisis`, `atm`, `ganglios`, `labios`, `vestibulo`, `paladarduroblando`, `lengua`, `piso_boca`, `periodonto`, `otros`, `ampliacion`) VALUES
(1, 1, '1', '0', '1', '1', '1', '1', '1', '1', '1', 'no');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `estado` varchar(5) NOT NULL,
  `idPersona` int(11) NOT NULL,
  `codigo_paciente` varchar(10) NOT NULL,
  `lugar_nacimiento` varchar(30) NOT NULL,
  `ocupacion` varchar(30) NOT NULL,
  `procedencia` varchar(30) NOT NULL,
  `fechaAlta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `estado`, `idPersona`, `codigo_paciente`, `lugar_nacimiento`, `ocupacion`, `procedencia`, `fechaAlta`) VALUES
(1, '1', 2, 'P001', 'Juliaca', 'Docente', 'Puno', '2017-06-11');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `apellPaterno` varchar(20) NOT NULL,
  `apellMater` varchar(20) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idPersona`, `nombres`, `apellPaterno`, `apellMater`, `dni`, `direccion`, `telefono`, `fecha_nacimiento`, `usuario`, `password`) VALUES
(1, 'David', 'Mamani', 'Pari', '43631917', 'Juliaca', '951782520', '2017-06-14', 'davidmp', '123456'),
(2, 'Elias', 'Mamani', 'Pari', '54875414', 'JUliaca', '95178454', '2017-06-12', 'elias', '123456'),
(3, 'Elias', 'Mamani', 'Pari', '54875414', 'JUliaca', '95178454', '2017-06-12', 'elias', '123456'),
(4, 'raul', 'mozo', 'mozo', '87542154', 'Juliaca', '8754879845', '2017-06-11', 'mozo', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `signosvitales`
--

CREATE TABLE `signosvitales` (
  `idSignovitales` int(11) NOT NULL,
  `presion` varchar(5) NOT NULL,
  `pulso` varchar(5) NOT NULL,
  `temperatura` varchar(5) NOT NULL,
  `peso` varchar(5) NOT NULL,
  `talla` varchar(5) NOT NULL,
  `idCitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `idTrabajo` int(11) NOT NULL,
  `estado` varchar(5) NOT NULL,
  `idPersona` int(11) NOT NULL,
  `fechaAlta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`idTrabajo`, `estado`, `idPersona`, `fechaAlta`) VALUES
(1, '1', 3, '2017-06-05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idTratamiento` int(11) NOT NULL,
  `idCitas` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `costo_total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`idTratamiento`, `idCitas`, `fecha`, `descripcion`, `costo_total`) VALUES
(1, 1, '2017-06-13', 'x', 14);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `analisis`
--
ALTER TABLE `analisis`
  ADD PRIMARY KEY (`idAnalisis`),
  ADD KEY `paciente_analisis_fk` (`idPaciente`);

--
-- Indices de la tabla `anamesis`
--
ALTER TABLE `anamesis`
  ADD PRIMARY KEY (`idAnamesis`),
  ADD KEY `analisis_anamesis_fk` (`idAnalisis`);

--
-- Indices de la tabla `ant_quirurgico`
--
ALTER TABLE `ant_quirurgico`
  ADD PRIMARY KEY (`idAntquirurgico`),
  ADD KEY `analisis_ant_quirurgico_fk` (`idAnalisis`);

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`idCitas`),
  ADD KEY `doctor_citas_fk` (`idDoctor`),
  ADD KEY `paciente_citas_fk` (`idPaciente`),
  ADD KEY `trabajador_citas_fk` (`idTrabajo`);

--
-- Indices de la tabla `detalle_diagnostico`
--
ALTER TABLE `detalle_diagnostico`
  ADD PRIMARY KEY (`idDetallediagnostico`),
  ADD KEY `dientes_detalle_diagnostico_fk` (`idDientes`),
  ADD KEY `diagnostico_detalle_diagnostico_fk` (`idDiagnostico`);

--
-- Indices de la tabla `detalle_tratamiento`
--
ALTER TABLE `detalle_tratamiento`
  ADD PRIMARY KEY (`idDetalleTratamiento`),
  ADD KEY `detalle_diagnostico_detalle_tratamiento_fk` (`idDetallediagnostico`),
  ADD KEY `tratamiento_detalle_tratamiento_fk` (`idTratamiento`);

--
-- Indices de la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
  ADD PRIMARY KEY (`idDiagnostico`),
  ADD KEY `doctor_diagnostico_fk` (`idDoctor`),
  ADD KEY `paciente_diagnostico_fk` (`idPaciente`);

--
-- Indices de la tabla `dientes`
--
ALTER TABLE `dientes`
  ADD PRIMARY KEY (`idDientes`);

--
-- Indices de la tabla `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`idDoctor`),
  ADD KEY `persona_doctor_fk` (`idPersona`);

--
-- Indices de la tabla `examen_auxiliares`
--
ALTER TABLE `examen_auxiliares`
  ADD PRIMARY KEY (`idExamenAuxiliar`),
  ADD KEY `analisis_examen_auxiliares_fk` (`idAnalisis`);

--
-- Indices de la tabla `examen_estomatologico`
--
ALTER TABLE `examen_estomatologico`
  ADD PRIMARY KEY (`idExamenestomatologico`),
  ADD KEY `analisis_examen_estomatologico_fk` (`idAnalisis`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD KEY `persona_paciente_fk` (`idPersona`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idPersona`);

--
-- Indices de la tabla `signosvitales`
--
ALTER TABLE `signosvitales`
  ADD PRIMARY KEY (`idSignovitales`),
  ADD KEY `citas_signosvitales_fk` (`idCitas`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`idTrabajo`),
  ADD KEY `persona_trabajador_fk` (`idPersona`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idTratamiento`),
  ADD KEY `citas_tratamiento_fk` (`idCitas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `analisis`
--
ALTER TABLE `analisis`
  MODIFY `idAnalisis` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `anamesis`
--
ALTER TABLE `anamesis`
  MODIFY `idAnamesis` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `ant_quirurgico`
--
ALTER TABLE `ant_quirurgico`
  MODIFY `idAntquirurgico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `idCitas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `detalle_diagnostico`
--
ALTER TABLE `detalle_diagnostico`
  MODIFY `idDetallediagnostico` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `detalle_tratamiento`
--
ALTER TABLE `detalle_tratamiento`
  MODIFY `idDetalleTratamiento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
  MODIFY `idDiagnostico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `dientes`
--
ALTER TABLE `dientes`
  MODIFY `idDientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `doctor`
--
ALTER TABLE `doctor`
  MODIFY `idDoctor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `examen_auxiliares`
--
ALTER TABLE `examen_auxiliares`
  MODIFY `idExamenAuxiliar` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `examen_estomatologico`
--
ALTER TABLE `examen_estomatologico`
  MODIFY `idExamenestomatologico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `signosvitales`
--
ALTER TABLE `signosvitales`
  MODIFY `idSignovitales` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  MODIFY `idTrabajo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `analisis`
--
ALTER TABLE `analisis`
  ADD CONSTRAINT `paciente_analisis_fk` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `anamesis`
--
ALTER TABLE `anamesis`
  ADD CONSTRAINT `analisis_anamesis_fk` FOREIGN KEY (`idAnalisis`) REFERENCES `analisis` (`idAnalisis`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ant_quirurgico`
--
ALTER TABLE `ant_quirurgico`
  ADD CONSTRAINT `analisis_ant_quirurgico_fk` FOREIGN KEY (`idAnalisis`) REFERENCES `analisis` (`idAnalisis`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `doctor_citas_fk` FOREIGN KEY (`idDoctor`) REFERENCES `doctor` (`idDoctor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `paciente_citas_fk` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `trabajador_citas_fk` FOREIGN KEY (`idTrabajo`) REFERENCES `trabajador` (`idTrabajo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detalle_diagnostico`
--
ALTER TABLE `detalle_diagnostico`
  ADD CONSTRAINT `diagnostico_detalle_diagnostico_fk` FOREIGN KEY (`idDiagnostico`) REFERENCES `diagnostico` (`idDiagnostico`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `dientes_detalle_diagnostico_fk` FOREIGN KEY (`idDientes`) REFERENCES `dientes` (`idDientes`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detalle_tratamiento`
--
ALTER TABLE `detalle_tratamiento`
  ADD CONSTRAINT `detalle_diagnostico_detalle_tratamiento_fk` FOREIGN KEY (`idDetallediagnostico`) REFERENCES `detalle_diagnostico` (`idDetallediagnostico`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tratamiento_detalle_tratamiento_fk` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`idTratamiento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
  ADD CONSTRAINT `doctor_diagnostico_fk` FOREIGN KEY (`idDoctor`) REFERENCES `doctor` (`idDoctor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `paciente_diagnostico_fk` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `persona_doctor_fk` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `examen_auxiliares`
--
ALTER TABLE `examen_auxiliares`
  ADD CONSTRAINT `analisis_examen_auxiliares_fk` FOREIGN KEY (`idAnalisis`) REFERENCES `analisis` (`idAnalisis`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `examen_estomatologico`
--
ALTER TABLE `examen_estomatologico`
  ADD CONSTRAINT `analisis_examen_estomatologico_fk` FOREIGN KEY (`idAnalisis`) REFERENCES `analisis` (`idAnalisis`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `persona_paciente_fk` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `signosvitales`
--
ALTER TABLE `signosvitales`
  ADD CONSTRAINT `citas_signosvitales_fk` FOREIGN KEY (`idCitas`) REFERENCES `citas` (`idCitas`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `persona_trabajador_fk` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD CONSTRAINT `citas_tratamiento_fk` FOREIGN KEY (`idCitas`) REFERENCES `citas` (`idCitas`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
