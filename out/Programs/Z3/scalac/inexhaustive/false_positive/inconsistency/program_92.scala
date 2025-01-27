package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: T_A[CC_A], b: (Byte,Byte)) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,0)) => 1 
}
}
// This is not matched: (CC_A Int Wildcard (T_A Int))