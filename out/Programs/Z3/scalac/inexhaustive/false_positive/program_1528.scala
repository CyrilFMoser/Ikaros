package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Boolean)], b: (Char,Int)) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_C Int (T_B (CC_A Int Boolean) Int))