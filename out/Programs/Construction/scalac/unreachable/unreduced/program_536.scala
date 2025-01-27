package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Char, T_A[Char, Int]], Char]
case class CC_B(a: T_A[T_A[(Boolean,Char), CC_A], T_A[CC_A, Boolean]]) extends T_A[T_A[Char, T_A[Char, Int]], Char]
case class CC_C(a: CC_B, b: T_A[CC_B, T_A[CC_B, (Boolean,Char)]]) extends T_A[T_A[Char, T_A[Char, Int]], Char]

val v_a: T_A[T_A[Char, T_A[Char, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), _) => 2 
}
}