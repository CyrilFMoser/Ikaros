package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Char,T_A[Char])) extends T_A[Char]
case class CC_B(a: T_A[CC_A]) extends T_A[Char]
case class CC_C(a: T_A[T_A[Byte]], b: T_A[Char]) extends T_B
case class CC_D(a: T_A[T_A[Char]], b: T_B) extends T_B
case class CC_E(a: (CC_C,Int), b: T_A[Char], c: CC_A) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
  case CC_A((_,CC_B(_))) => 1 
  case CC_B(_) => 2 
}
}