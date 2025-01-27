package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D], b: (Char,Int)) extends T_A[D, C]
case class CC_B[E, F, G]() extends T_A[E, F]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), ('x',12)) => 1 
  case CC_A(CC_B(), (_,_)) => 2 
  case CC_A(CC_A(_, _), ('x',12)) => 3 
  case CC_A(CC_A(_, _), _) => 4 
  case CC_A(CC_B(), _) => 5 
  case CC_A(CC_A(_, _), (_,_)) => 6 
  case CC_A(CC_B(), (_,12)) => 7 
}
}
// This is not matched: (CC_B Char Byte (CC_A Boolean Boolean Boolean Boolean Boolean) (T_A Char Byte))
// This is not matched: (CC_C Int Wildcard Wildcard Wildcard (T_B Int))