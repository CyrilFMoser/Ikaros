package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F]() extends T_A[E, D]
case class CC_B(a: (Boolean,Int), b: T_A[Char, Byte], c: Boolean) extends T_A[CC_A[Byte, Boolean, Byte], (Boolean,Boolean)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,_), CC_A(), _) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_A Char Byte Boolean (T_A Char Byte))
//      Wildcard
//      (T_A (CC_A Byte Boolean Byte Boolean) (Tuple Boolean Boolean)))
// This is not matched: Pattern match is empty without constants