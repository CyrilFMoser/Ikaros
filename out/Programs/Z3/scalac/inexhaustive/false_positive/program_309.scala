package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Int,Byte)) extends T_A[T_A[Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_A Int (CC_A Int Wildcard Wildcard (T_A Int)) Wildcard (T_A Int))