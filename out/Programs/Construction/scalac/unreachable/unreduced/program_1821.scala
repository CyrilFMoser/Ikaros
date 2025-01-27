package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[CC_A[Boolean]], b: Byte, c: T_A[CC_A[Boolean], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]], T_A[T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]], T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]]]]
case class CC_C(a: CC_A[(Byte,CC_B)]) extends T_A[T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]], T_A[T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]], T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]]]]

val v_a: T_A[T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]], T_A[T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]], T_A[T_A[(Int,Int), Int], T_A[T_A[(Int,Int), Int], T_A[(Int,Int), Int]]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(_) => 2 
}
}