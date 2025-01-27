package Program_14 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: Char) extends T_A[T_B[Byte]]
case class CC_B[D, E](a: T_B[Int], b: ((Int,Boolean),Byte)) extends T_B[D]
case class CC_C() extends T_B[T_A[Boolean]]

val v_a: T_B[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(CC_B(_, _), ((_,_),_)) => 1 
  case CC_B(_, _) => 2 
  case CC_B(CC_B(_, _), _) => 3 
}
}
// This is not matched: (CC_B (T_A Boolean) Boolean Wildcard Wildcard (T_B (T_A Boolean)))
// This is not matched: (CC_B T_A Wildcard T_A)