package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B(a: (CC_A[Int],(Boolean,(Byte,Boolean))), b: T_A[T_A[Char, Boolean], T_A[Boolean, Byte]]) extends T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]]
case class CC_C[D](a: CC_B, b: T_A[D, D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_C(_, _)) => 1 
  case CC_C(CC_B(_, _), _) => 2 
}
}