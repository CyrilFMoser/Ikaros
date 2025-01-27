package Program_13 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E, F](a: T_B[F, (Int,Int)]) extends T_A[E]
case class CC_C[G](a: Boolean, b: T_A[G]) extends T_B[CC_A[Boolean], G]
case class CC_D[H](a: T_B[H, Boolean], b: T_B[H, H]) extends T_B[CC_A[Boolean], H]
case class CC_E(a: ((Byte,Int),Byte), b: T_B[Char, Boolean]) extends T_B[CC_A[Boolean], CC_A[Boolean]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_)) => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_A Char
//            (CC_A Char
//                  (CC_A Char (CC_B Char Boolean Wildcard (T_A Char)) (T_A Char))
//                  (T_A Char))
//            (T_A Char))
//      (T_A Char))
// This is not matched: Pattern match is empty without constants