package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: (((Char,Boolean),Int),(Int,Int))) extends T_B[T_B[T_A[Boolean], T_A[Byte]], T_A[CC_B[Int]]]
case class CC_D(a: CC_B[T_A[Char]], b: T_B[(CC_C,CC_C), CC_B[CC_C]], c: Char) extends T_B[T_B[T_A[Boolean], T_A[Byte]], T_A[CC_B[Int]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_A(CC_D(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(CC_D(_, _, _), _, CC_B()), CC_A(CC_D(_, _, _), _, CC_A(_, _, _))) => 1 
  case CC_A(_, CC_B(), CC_A(CC_D(_, _, _), _, CC_A(_, _, _))) => 2 
  case CC_A(_, CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_A(CC_D(_, _, _), _, CC_B())) => 3 
  case CC_A(_, CC_A(CC_D(_, _, _), _, CC_B()), CC_A(CC_D(_, _, _), _, CC_B())) => 4 
  case CC_A(_, CC_B(), CC_A(CC_D(_, _, _), _, CC_B())) => 5 
  case CC_A(_, CC_A(CC_D(_, _, _), _, CC_A(_, _, _)), CC_B()) => 6 
  case CC_A(_, CC_A(CC_D(_, _, _), _, CC_B()), CC_B()) => 7 
  case CC_A(_, CC_B(), CC_B()) => 8 
  case CC_B() => 9 
}
}