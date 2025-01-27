package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Byte]
case class CC_B(a: CC_A[T_B], b: CC_A[T_A[T_B, Int]], c: T_A[T_A[T_B, T_B], Byte]) extends T_B
case class CC_C(a: T_B, b: T_A[((Byte,Char),T_B), (T_B,CC_B)], c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C(CC_B(_, _, _), _, CC_B(CC_A(), CC_A(), CC_A())) => 1 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_B(_, _, _), _, CC_B(_, _, _))) => 2 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_B(_, _, _), _, CC_C(_, _, _))) => 3 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_B(_, _, _), _, CC_D())) => 4 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_C(_, _, _), _, CC_B(_, _, _))) => 5 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 6 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_C(_, _, _), _, CC_D())) => 7 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_D(), _, CC_B(_, _, _))) => 8 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_D(), _, CC_C(_, _, _))) => 9 
  case CC_C(CC_B(_, _, _), _, CC_C(CC_D(), _, CC_D())) => 10 
  case CC_C(CC_B(_, _, _), _, CC_D()) => 11 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_B(CC_A(), CC_A(), CC_A())) => 12 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), _, CC_B(_, _, _))) => 13 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), _, CC_C(_, _, _))) => 14 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_B(_, _, _), _, CC_D())) => 15 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), _, CC_B(_, _, _))) => 16 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 17 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_C(_, _, _), _, CC_D())) => 18 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_D(), _, CC_B(_, _, _))) => 19 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_D(), _, CC_C(_, _, _))) => 20 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_C(CC_D(), _, CC_D())) => 21 
  case CC_C(CC_C(_, _, CC_B(_, _, _)), _, CC_D()) => 22 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_B(CC_A(), CC_A(), CC_A())) => 23 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), _, CC_B(_, _, _))) => 24 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), _, CC_C(_, _, _))) => 25 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_B(_, _, _), _, CC_D())) => 26 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), _, CC_B(_, _, _))) => 27 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 28 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_C(_, _, _), _, CC_D())) => 29 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_D(), _, CC_B(_, _, _))) => 30 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_D(), _, CC_C(_, _, _))) => 31 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_C(CC_D(), _, CC_D())) => 32 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, CC_D()) => 33 
  case CC_C(CC_C(_, _, CC_D()), _, CC_B(CC_A(), CC_A(), CC_A())) => 34 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_B(_, _, _), _, CC_B(_, _, _))) => 35 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_B(_, _, _), _, CC_C(_, _, _))) => 36 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_B(_, _, _), _, CC_D())) => 37 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_C(_, _, _), _, CC_B(_, _, _))) => 38 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 39 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_C(_, _, _), _, CC_D())) => 40 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_D(), _, CC_B(_, _, _))) => 41 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_D(), _, CC_C(_, _, _))) => 42 
  case CC_C(CC_C(_, _, CC_D()), _, CC_C(CC_D(), _, CC_D())) => 43 
  case CC_C(CC_C(_, _, CC_D()), _, CC_D()) => 44 
  case CC_C(CC_D(), _, CC_B(CC_A(), CC_A(), CC_A())) => 45 
  case CC_C(CC_D(), _, CC_C(CC_B(_, _, _), _, CC_B(_, _, _))) => 46 
  case CC_C(CC_D(), _, CC_C(CC_B(_, _, _), _, CC_C(_, _, _))) => 47 
  case CC_C(CC_D(), _, CC_C(CC_B(_, _, _), _, CC_D())) => 48 
  case CC_C(CC_D(), _, CC_C(CC_C(_, _, _), _, CC_B(_, _, _))) => 49 
  case CC_C(CC_D(), _, CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 50 
  case CC_C(CC_D(), _, CC_C(CC_C(_, _, _), _, CC_D())) => 51 
  case CC_C(CC_D(), _, CC_C(CC_D(), _, CC_B(_, _, _))) => 52 
  case CC_C(CC_D(), _, CC_C(CC_D(), _, CC_D())) => 53 
  case CC_C(CC_D(), _, CC_D()) => 54 
  case CC_D() => 55 
}
}
// This is not matched: CC_C(CC_D(), _, CC_C(CC_D(), _, CC_C(_, _, _)))