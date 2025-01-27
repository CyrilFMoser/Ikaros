package Program_11 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G, H]() extends T_A[G, Byte]
case class CC_C[I, J](a: T_A[J, J], b: (Char,(Char,Boolean)), c: J) extends T_B[I, J]

val v_a: CC_C[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), ('x',(_,_)), _) => 0 
  case CC_C(CC_B(), _, _) => 1 
  case CC_C(_, ('x',(_,_)), 0) => 2 
  case CC_C(_, _, 0) => 3 
  case CC_C(CC_A(), _, _) => 4 
}
}
// This is not matched: (CC_C Int
//      Byte
//      (CC_B Byte Boolean (T_A Byte Byte))
//      (Tuple Wildcard Wildcard)
//      Wildcard
//      (T_B Int Byte))
// This is not matched: (CC_C (T_A (CC_A T_B)))