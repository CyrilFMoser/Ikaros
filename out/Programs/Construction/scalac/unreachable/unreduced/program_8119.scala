package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_B, b: T_A[Char]) extends T_B
case class CC_C(a: Char) extends T_B
case class CC_D(a: (T_B,CC_B), b: (Byte,CC_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_D((_,_), (_,_)), _) => 1 
  case CC_C(_) => 2 
  case CC_D(_, (_,CC_B(_, _))) => 3 
}
}
// This is not matched: CC_B(CC_C(_), _)