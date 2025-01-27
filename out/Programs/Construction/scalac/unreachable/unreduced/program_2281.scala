package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Int]), b: Int, c: T_A[T_A[Boolean]]) extends T_A[Int]
case class CC_B(a: T_A[T_A[Int]]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 0 
  case CC_A((CC_A(_, _, _),CC_B(_)), _, _) => 1 
  case CC_A((CC_A(_, _, _),CC_C()), _, _) => 2 
  case CC_A((CC_B(_),CC_A(_, _, _)), _, _) => 3 
  case CC_A((CC_B(_),CC_B(_)), _, _) => 4 
  case CC_A((CC_B(_),CC_C()), _, _) => 5 
  case CC_A((CC_C(),CC_A(_, _, _)), _, _) => 6 
  case CC_A((CC_C(),CC_B(_)), _, _) => 7 
  case CC_A((CC_C(),CC_C()), _, _) => 8 
  case CC_B(_) => 9 
  case CC_C() => 10 
}
}