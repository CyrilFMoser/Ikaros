package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Char,Char), T_A[Int, Int]]]
case class CC_B(a: T_A[T_A[(Char,Char), Boolean], T_A[Int, Char]]) extends T_A[T_A[T_A[Byte, Int], CC_A[Byte]], T_A[(Char,Char), T_A[Int, Int]]]
case class CC_C[D](a: D) extends T_A[Char, D]

val v_a: T_A[Char, T_A[(Char,Char), T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}