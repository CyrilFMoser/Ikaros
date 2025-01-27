package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, C], b: T_A[C, C], c: (Byte,Byte)) extends T_A[C, D]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,0)) => 1 
  case CC_A(_, CC_A(_, _, _), (_,_)) => 2 
}
}
// This is not matched: (CC_A Byte
//      Byte
//      (CC_A Boolean Boolean Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Byte Byte))
// This is not matched: (CC_C Int Wildcard Wildcard Int (T_A Int))