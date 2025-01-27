package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Char], T_A[Boolean, Int]], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: (T_A[(Char,Int), Char],T_A[Int, Char])) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, Int]], D]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Boolean, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}