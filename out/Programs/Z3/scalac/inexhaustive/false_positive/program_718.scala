package Program_28 

package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: ((Char,Boolean),Boolean)) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(((_,_),_)) => 1 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard (T_A Byte))
// This is not matched: (CC_A (CC_C Boolean Boolean Boolean)
//      Wildcard
//      (T_A Byte (CC_C Boolean Boolean Boolean)))