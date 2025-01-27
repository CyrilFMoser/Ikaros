package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,Int), b: T_A[Boolean]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,12), _) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_C T_B) (CC_D T_B)) T_B)