package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B(a: (T_B[Boolean],T_B[Int]), b: CC_A[T_B[Int]], c: (CC_A[Char],T_B[Int])) extends T_B[Int]
case class CC_C(a: CC_B, b: ((Char,Char),T_B[Char]), c: Char) extends T_B[Int]
case class CC_D() extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B((_,_), CC_A(), (_,_)) => 0 
  case CC_C(CC_B(_, _, _), (_,_), _) => 1 
  case CC_D() => 2 
}
}