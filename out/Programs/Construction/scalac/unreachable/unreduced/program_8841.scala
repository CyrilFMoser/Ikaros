package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: (T_B[Char, (Boolean,Char)],Boolean), b: T_B[E, Boolean], c: (Char,T_B[Char, Byte])) extends T_B[E, Boolean]
case class CC_C[F](a: CC_A[F], b: (T_B[Int, Boolean],T_A[(Char,Int)])) extends T_B[F, Boolean]
case class CC_D(a: (Int,T_A[Byte]), b: T_A[CC_C[Boolean]]) extends T_B[T_B[T_A[Char], Boolean], Boolean]

val v_a: T_B[CC_D, Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _, ('x',_)) => 0 
  case CC_B((_,_), _, (_,_)) => 1 
  case CC_C(_, (CC_B(_, _, _),CC_A())) => 2 
  case CC_C(_, (CC_C(_, _),CC_A())) => 3 
}
}