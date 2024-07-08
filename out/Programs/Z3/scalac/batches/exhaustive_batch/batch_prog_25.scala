package Program_25 

 object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: T_A[C, Int]) extends T_A[C, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
}
}