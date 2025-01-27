package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[T_A[(Int,Int)]], b: T_B[(CC_A,CC_A), CC_A], c: T_B[CC_A, CC_A]) extends T_A[(T_B[CC_A, CC_A],T_B[CC_A, CC_A])]
case class CC_C() extends T_A[Int]
case class CC_D[D](a: T_A[D], b: CC_C) extends T_B[T_A[CC_A], D]
case class CC_E(a: CC_C, b: T_B[CC_D[CC_A], CC_D[CC_A]], c: CC_A) extends T_B[T_A[CC_A], Char]
case class CC_F() extends T_B[T_A[CC_A], Char]

val v_a: T_B[T_A[CC_A], Char] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C()) => 0 
  case CC_E(CC_C(), _, CC_A()) => 1 
  case CC_F() => 2 
}
}