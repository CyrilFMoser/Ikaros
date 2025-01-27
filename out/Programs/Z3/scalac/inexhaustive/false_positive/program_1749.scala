package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte, b: (Byte,Byte)) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D, E](a: Boolean) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
  case CC_A(_, (_,_)) => 2 
  case CC_A(_, (0,_)) => 3 
}
}
// This is not matched: (CC_C Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))