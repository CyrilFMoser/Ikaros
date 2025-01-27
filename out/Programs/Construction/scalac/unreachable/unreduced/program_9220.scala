package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],T_A[Char]), b: T_A[T_B]) extends T_A[Char]
case class CC_B(a: T_B) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _)), _) => 0 
  case CC_A((_,CC_B(_)), _) => 1 
  case CC_B(_) => 2 
}
}