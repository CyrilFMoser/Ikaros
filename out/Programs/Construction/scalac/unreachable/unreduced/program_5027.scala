package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Byte, Boolean], T_B[Boolean, (Boolean,Int)]], b: T_B[T_B[Boolean, Boolean], Boolean]) extends T_A[(T_B[Byte, Int],T_B[Char, Boolean]), T_B[Int, T_B[Boolean, Int]]]
case class CC_B[E](a: T_B[E, E], b: (Byte,T_B[CC_A, Boolean])) extends T_B[E, T_A[(CC_A,CC_A), Byte]]
case class CC_C[F](a: F) extends T_B[F, T_A[(CC_A,CC_A), Byte]]

val v_a: T_B[Byte, T_A[(CC_A,CC_A), Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, (0,_)) => 0 
  case CC_B(_, (_,_)) => 1 
  case CC_C(_) => 2 
}
}