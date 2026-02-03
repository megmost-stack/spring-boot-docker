--
-- PostgreSQL database dump
--

\restrict 1qgEcptT1rYZcFsdtORvOLr8ys1weGsxHlKhRKPLPpc41k0xohqDEZeEL3bb2Ax

-- Dumped from database version 15.15 (Debian 15.15-1.pgdg13+1)
-- Dumped by pg_dump version 15.15 (Debian 15.15-1.pgdg13+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Data for Name: authors; Type: TABLE DATA; Schema: public; Owner: admin
--



--
-- Data for Name: categories; Type: TABLE DATA; Schema: public; Owner: admin
--



--
-- Data for Name: products; Type: TABLE DATA; Schema: public; Owner: admin
--



--
-- Data for Name: product_category; Type: TABLE DATA; Schema: public; Owner: admin
--



--
-- Name: authors_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('public.authors_id_seq', 1, false);


--
-- PostgreSQL database dump complete
--

\unrestrict 1qgEcptT1rYZcFsdtORvOLr8ys1weGsxHlKhRKPLPpc41k0xohqDEZeEL3bb2Ax

