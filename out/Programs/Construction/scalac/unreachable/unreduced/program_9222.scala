package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Char, Int], T_B[(Char,Boolean), (Boolean,Boolean)]], b: Boolean) extends T_A[T_A[(Char,Int), T_A[Int, Char]], T_A[Int, T_B[(Boolean,Char), (Int,Boolean)]]]
case class CC_B(a: Byte) extends T_A[T_B[T_B[Boolean, CC_A], T_A[CC_A, CC_A]], Char]
case class CC_C(a: Byte, b: CC_B, c: CC_B) extends T_A[T_A[(Char,Int), T_A[Int, Char]], T_A[Int, T_B[(Boolean,Char), (Int,Boolean)]]]
case class CC_D[E](a: Char) extends T_B[(CC_B,Byte), E]
case class CC_E[F](a: T_B[F, F], b: T_A[F, F], c: CC_C) extends T_B[(CC_B,Byte), F]

val v_a: T_B[(CC_B,Byte), CC_B] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
  case CC_D(_) => 1 
  case CC_E(_, _, _) => 2 
}
}