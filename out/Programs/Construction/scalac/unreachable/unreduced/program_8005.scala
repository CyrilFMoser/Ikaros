package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char) extends T_A[C]
case class CC_B(a: T_A[Int]) extends T_A[T_A[(Char,Char)]]
case class CC_C[D](a: D) extends T_A[D]
case class CC_D(a: (T_B[CC_B],Int), b: T_B[CC_B], c: T_B[CC_C[Char]]) extends T_B[CC_B]
case class CC_E(a: T_A[Boolean], b: CC_D, c: CC_B) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D((CC_D(_, _, _),_), _, _) => 0 
  case CC_D((CC_E(_, _, _),_), _, _) => 1 
  case CC_E(_, _, _) => 2 
}
}