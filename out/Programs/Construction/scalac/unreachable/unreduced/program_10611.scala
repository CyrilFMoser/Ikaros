package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Int, b: Int, c: Char) extends T_A[E, F]
case class CC_B[H, G](a: T_A[H, G]) extends T_A[H, G]
case class CC_C(a: T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], b: CC_A[CC_A[Int, Int], Boolean]) extends T_B[CC_B[CC_A[Byte, Int], CC_B[Byte, Byte]], T_A[(Char,Boolean), CC_A[Int, Boolean]]]
case class CC_D(a: CC_B[T_A[CC_C, CC_C], T_A[CC_C, CC_C]], b: T_B[T_A[CC_C, CC_C], CC_A[CC_C, CC_C]], c: CC_C) extends T_B[CC_B[CC_A[Byte, Int], CC_B[Byte, Byte]], T_A[(Char,Boolean), CC_A[Int, Boolean]]]
case class CC_E() extends T_B[CC_B[CC_A[Byte, Int], CC_B[Byte, Byte]], T_A[(Char,Boolean), CC_A[Int, Boolean]]]

val v_a: T_B[CC_B[CC_A[Byte, Int], CC_B[Byte, Byte]], T_A[(Char,Boolean), CC_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_C(CC_B(CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_C(CC_B(CC_B(_)), CC_A(_, _, _)) => 2 
  case CC_D(CC_B(_), _, CC_C(CC_A(_, _, _), CC_A(_, _, _))) => 3 
  case CC_D(CC_B(_), _, CC_C(CC_B(_), CC_A(_, _, _))) => 4 
  case CC_E() => 5 
}
}