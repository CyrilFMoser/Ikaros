package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Char, b: T_B[T_B[Int]], c: Boolean) extends T_A[T_A[T_B[Int], T_A[Char, Byte]], T_A[(Byte,Char), Byte]]
case class CC_B() extends T_A[T_A[T_B[Int], T_A[Char, Byte]], T_A[(Byte,Char), Byte]]
case class CC_C(a: T_A[T_A[CC_B, CC_A], CC_A], b: T_A[CC_B, T_B[CC_A]]) extends T_A[T_A[T_B[Int], T_A[Char, Byte]], T_A[(Byte,Char), Byte]]
case class CC_D[D](a: D, b: T_B[D], c: Int) extends T_B[D]

val v_a: T_A[T_A[T_B[Int], T_A[Char, Byte]], T_A[(Byte,Char), Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _), _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()