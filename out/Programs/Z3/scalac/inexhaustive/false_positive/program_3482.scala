package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: ((Int,Int),Byte)) extends T_A[T_A[Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_A Int
//      Wildcard
//      (CC_A Int Int (CC_B Int Wildcard Wildcard Wildcard (T_A Int)) (T_A Int))
//      (T_A Int))