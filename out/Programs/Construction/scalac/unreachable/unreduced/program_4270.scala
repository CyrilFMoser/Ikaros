package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Int]
case class CC_B(a: T_A[(Boolean,Boolean), Int], b: (T_A[Byte, Int],Int), c: T_A[Boolean, T_A[Byte, Int]]) extends T_A[CC_A[T_A[(Boolean,Boolean), Int]], Int]
case class CC_C(a: CC_B, b: T_A[Char, Int], c: T_A[Boolean, Int]) extends T_A[Boolean, Int]

val v_a: T_A[CC_A[T_A[(Boolean,Boolean), Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}