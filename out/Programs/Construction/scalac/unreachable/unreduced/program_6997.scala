package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[T_A[D, D]], c: D) extends T_A[T_A[T_B[Int], ((Byte,Char),(Char,Boolean))], D]
case class CC_B[E](a: CC_A[E], b: Char) extends T_A[T_A[T_B[Int], ((Byte,Char),(Char,Boolean))], E]
case class CC_C[F](a: Int) extends T_A[T_A[T_B[Int], ((Byte,Char),(Char,Boolean))], F]
case class CC_D(a: CC_C[Int], b: (CC_A[Int],T_B[(Byte,Byte)]), c: (T_B[Char],CC_A[Int])) extends T_B[(T_A[Int, Char],T_A[(Byte,Char), Int])]

val v_a: T_A[T_A[T_B[Int], ((Byte,Char),(Char,Boolean))], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 12) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(_, _, _), _) => 2 
  case CC_C(_) => 3 
}
}