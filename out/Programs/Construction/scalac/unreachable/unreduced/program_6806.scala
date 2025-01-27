package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[Char]
case class CC_B(a: (Byte,Int), b: CC_A[T_A[Char]], c: T_B[T_A[Char], (Byte,(Boolean,Int))]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(CC_A(_, _), _), _) => 1 
  case CC_B(_, CC_A(CC_B(_, _, _), _), _) => 2 
}
}