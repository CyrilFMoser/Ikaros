package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Byte, Char], T_B[Boolean, Char]]]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C(a: CC_B[CC_B[CC_A]], b: (CC_A,CC_B[CC_A])) extends T_A[T_B[T_B[Byte, Char], T_B[Boolean, Char]]]

val v_a: T_A[T_B[T_B[Byte, Char], T_B[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(CC_C(_, (_,_)))