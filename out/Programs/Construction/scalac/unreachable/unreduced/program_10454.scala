package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[(Char,Boolean), T_A[(Char,Boolean), (Char,Boolean)]], b: Byte) extends T_A[E, T_A[E, E]]
case class CC_B(a: CC_A[CC_A[Char, Int], T_A[Int, Char]], b: T_A[CC_A[Char, Byte], T_A[CC_A[Char, Byte], CC_A[Char, Byte]]]) extends T_B[(CC_A[(Int,Char), Boolean],CC_A[Boolean, (Boolean,Char)]), T_A[CC_A[Char, Int], T_A[CC_A[Char, Int], CC_A[Char, Int]]]]
case class CC_C(a: T_A[CC_B, CC_B]) extends T_B[(CC_A[(Int,Char), Boolean],CC_A[Boolean, (Boolean,Char)]), T_A[CC_A[Char, Int], T_A[CC_A[Char, Int], CC_A[Char, Int]]]]

val v_a: T_B[(CC_A[(Int,Char), Boolean],CC_A[Boolean, (Boolean,Char)]), T_A[CC_A[Char, Int], T_A[CC_A[Char, Int], CC_A[Char, Int]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, 0)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _), CC_A(_, _))