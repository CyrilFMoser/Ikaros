package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B(a: T_A[(Boolean,Int)], b: (Char,T_B)) extends T_A[T_A[(Boolean,Byte)]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_B Int Int (T_A Int Int))