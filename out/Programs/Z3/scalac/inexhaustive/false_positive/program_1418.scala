package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C, b: (Int,Boolean)) extends T_A[B]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C[D](a: (Char,Boolean)) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_C((_,_)) => 0 
  case CC_A(_, _) => 1 
  case CC_A(_, (_,_)) => 2 
}
}
// This is not matched: (CC_A Boolean Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_D (CC_A Byte (Tuple Char Char) Boolean)
//      Wildcard
//      (T_B (CC_A Byte (Tuple Char Char) Boolean)))