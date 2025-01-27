package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char) extends T_A[T_A[(Byte,Char)]]
case class CC_B[C](a: C) extends T_B[T_A[CC_A]]

val v_a: T_B[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_B (T_A (CC_A Boolean Boolean))))
// This is not matched: (CC_A Char (T_A Char))