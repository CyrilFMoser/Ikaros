package Program_30 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Byte,(Char,Byte))]
case class CC_B[B](a: (CC_A,CC_A), b: CC_A) extends T_A[T_A[CC_A]]

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),CC_A()), _) => 0 
  case CC_B((CC_A(),CC_A()), CC_A()) => 1 
}
}
// This is not matched: (CC_B Boolean
//      Wildcard
//      (CC_A (T_A (Tuple Byte (Tuple Char Byte))))
//      (T_A (T_A (CC_A Boolean))))
// This is not matched: Pattern match is empty without constants