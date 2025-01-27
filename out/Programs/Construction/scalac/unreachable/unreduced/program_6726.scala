package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: CC_A, b: (T_A[Char],Int), c: (T_A[Char],(CC_A,CC_A))) extends T_A[Char]
case class CC_C(a: T_A[Char], b: CC_B, c: T_A[Byte]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_A(),_), _) => 1 
  case CC_B(_, (CC_C(_, _, _),_), _) => 2 
  case CC_C(CC_A(), _, _) => 3 
  case CC_C(CC_B(CC_A(), _, _), _, _) => 4 
  case CC_C(CC_C(_, _, _), _, _) => 5 
}
}
// This is not matched: CC_B(_, (CC_B(_, _, _),_), _)