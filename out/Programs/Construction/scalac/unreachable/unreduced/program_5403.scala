package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[Boolean, E], b: T_B[F, F], c: E) extends T_A[F, E]
case class CC_B[G](a: CC_A[G, G]) extends T_A[G, CC_A[G, G]]
case class CC_C(a: CC_B[T_A[Int, Char]], b: T_B[T_A[Char, Byte], Int], c: T_B[T_B[Byte, Boolean], T_A[Int, Int]]) extends T_A[T_A[T_A[Char, Boolean], CC_A[T_A[Char, Boolean], T_A[Char, Boolean]]], (T_A[Boolean, Int],((Byte,Boolean),Boolean))]
case class CC_D(a: T_A[Boolean, CC_A[CC_C, (Boolean,Boolean)]]) extends T_B[T_A[T_A[(Int,Char), Char], CC_A[T_A[(Int,Char), Char], T_A[(Int,Char), Char]]], Boolean]
case class CC_E(a: Int, b: T_A[T_B[Boolean, CC_C], CC_D]) extends T_B[T_A[T_A[(Int,Char), Char], CC_A[T_A[(Int,Char), Char], T_A[(Int,Char), Char]]], Boolean]
case class CC_F(a: (CC_D,(CC_E,CC_C)), b: Boolean) extends T_B[T_A[T_A[(Int,Char), Char], CC_A[T_A[(Int,Char), Char], T_A[(Int,Char), Char]]], Boolean]

val v_a: T_B[T_A[T_A[(Int,Char), Char], CC_A[T_A[(Int,Char), Char], T_A[(Int,Char), Char]]], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_F((CC_D(_),(_,_)), _)