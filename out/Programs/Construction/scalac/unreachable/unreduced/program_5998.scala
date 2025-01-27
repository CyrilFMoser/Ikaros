package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Boolean]], C]
case class CC_B(a: (T_A[Int, Char],T_A[Int, Boolean])) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Boolean]], T_A[T_A[Int, Char], Byte]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Char, Boolean]], T_A[T_A[Int, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
}
}