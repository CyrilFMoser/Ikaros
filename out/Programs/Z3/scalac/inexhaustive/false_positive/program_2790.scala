package Program_27 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Byte,(Char,Byte))]
case class CC_B[B](a: (CC_A,CC_A), b: CC_A) extends T_A[T_A[CC_A]]

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A (T_A (CC_A Boolean))))
// This is not matched: Pattern match is empty without constants