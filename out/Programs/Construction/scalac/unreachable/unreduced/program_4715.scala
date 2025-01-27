package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D], c: T_A[D, T_B[D]]) extends T_A[D, T_B[D]]
case class CC_B(a: T_A[T_B[Int], T_B[T_B[Int]]], b: T_A[Byte, T_B[Byte]], c: T_A[Byte, T_B[Byte]]) extends T_A[Byte, T_B[Byte]]
case class CC_C(a: T_A[T_A[(Int,Char), Char], T_B[T_A[(Int,Char), Char]]], b: CC_A[CC_B]) extends T_A[T_A[Byte, T_B[Byte]], T_B[T_A[Byte, T_B[Byte]]]]
case class CC_D(a: CC_C, b: CC_A[T_A[Int, CC_B]], c: CC_C) extends T_B[Byte]
case class CC_E(a: T_A[CC_D, T_B[CC_C]], b: T_A[Byte, T_B[Byte]], c: CC_D) extends T_B[Byte]
case class CC_F() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _), _, CC_C(CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_E(_, CC_A(_, _, _), _) => 1 
  case CC_E(_, CC_B(_, _, _), _) => 2 
  case CC_F() => 3 
}
}