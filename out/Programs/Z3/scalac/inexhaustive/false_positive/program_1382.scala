package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Byte]]
case class CC_B(a: T_A[Int], b: (Byte,Boolean)) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_)) => 1 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Byte)))
// This is not matched: (CC_B Wildcard T_B)