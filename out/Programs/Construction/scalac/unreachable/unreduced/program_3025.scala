package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Char,Int), b: T_A[(T_B,(Byte,Char))]) extends T_A[T_A[Byte]]
case class CC_B(a: T_B, b: T_B, c: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_C(a: T_A[T_A[Byte]], b: T_A[T_A[Byte]]) extends T_B
case class CC_D(a: CC_A) extends T_B

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_A((_,_), _)) => 1 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_A((_,_), _)) => 2 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_C(_, _), CC_A(_, _))) => 3 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_C(_, _), CC_A(_, _))) => 4 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_C(_, _), CC_B(_, _, _))) => 5 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_C(_, _), CC_B(_, _, _))) => 6 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_D(_), CC_A(_, _))) => 7 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_D(_), CC_A(_, _))) => 8 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_D(_), CC_B(_, _, _))) => 9 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_D(_), CC_B(_, _, _))) => 10 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_B(CC_D(_), CC_C(_, _), CC_A(_, _))) => 11 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_C(_, _), CC_A(_, _))) => 12 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_B(CC_D(_), CC_C(_, _), CC_B(_, _, _))) => 13 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_C(_, _), CC_B(_, _, _))) => 14 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_B(CC_D(_), CC_D(_), CC_A(_, _))) => 15 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_D(_), CC_A(_, _))) => 16 
  case CC_B(CC_C(_, CC_A(_, _)), CC_C(_, _), CC_B(CC_D(_), CC_D(_), CC_B(_, _, _))) => 17 
  case CC_B(CC_C(_, CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_D(_), CC_B(_, _, _))) => 18 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_A((_,_), _)) => 19 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_A((_,_), _)) => 20 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_C(_, _), CC_A(_, _))) => 21 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_C(_, _), CC_A(_, _))) => 22 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_C(_, _), CC_B(_, _, _))) => 23 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_C(_, _), CC_B(_, _, _))) => 24 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_D(_), CC_A(_, _))) => 25 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_D(_), CC_A(_, _))) => 26 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_D(_), CC_B(_, _, _))) => 27 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_D(_), CC_B(_, _, _))) => 28 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_B(CC_D(_), CC_C(_, _), CC_A(_, _))) => 29 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_C(_, _), CC_A(_, _))) => 30 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_B(CC_D(_), CC_C(_, _), CC_B(_, _, _))) => 31 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_C(_, _), CC_B(_, _, _))) => 32 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_B(CC_D(_), CC_D(_), CC_A(_, _))) => 33 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_D(_), CC_A(_, _))) => 34 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_C(_, _), CC_B(CC_D(_), CC_D(_), CC_B(_, _, _))) => 35 
  case CC_B(CC_C(_, CC_B(_, _, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_D(_), CC_B(_, _, _))) => 36 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_A((_,_), _)) => 37 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_A((_,_), _)) => 38 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_C(_, _), CC_A(_, _))) => 39 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_C(_, _), CC_A(_, _))) => 40 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_C(_, _), CC_B(_, _, _))) => 41 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_C(_, _), CC_B(_, _, _))) => 42 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_D(_), CC_A(_, _))) => 43 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_D(_), CC_A(_, _))) => 44 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_B(CC_C(_, _), CC_D(_), CC_B(_, _, _))) => 45 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_C(_, _), CC_D(_), CC_B(_, _, _))) => 46 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_B(CC_D(_), CC_C(_, _), CC_A(_, _))) => 47 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_C(_, _), CC_A(_, _))) => 48 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_B(CC_D(_), CC_C(_, _), CC_B(_, _, _))) => 49 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_C(_, _), CC_B(_, _, _))) => 50 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_B(CC_D(_), CC_D(_), CC_A(_, _))) => 51 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_D(_), CC_A(_, _))) => 52 
  case CC_B(CC_D(CC_A(_, _)), CC_C(_, _), CC_B(CC_D(_), CC_D(_), CC_B(_, _, _))) => 53 
  case CC_B(CC_D(CC_A(_, _)), CC_D(CC_A(_, _)), CC_B(CC_D(_), CC_D(_), CC_B(_, _, _))) => 54 
}
}