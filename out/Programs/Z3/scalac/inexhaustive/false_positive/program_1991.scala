package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: (Byte,CC_A), b: T_A[CC_A]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B((0,_), _) => 0 
  case CC_A() => 1 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_B Wildcard Wildcard (CC_A Wildcard Int T_A) T_A)
//      Wildcard
//      T_A)