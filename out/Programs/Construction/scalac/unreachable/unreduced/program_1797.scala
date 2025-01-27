package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: (T_A[(Boolean,Byte)],T_A[Byte]), c: C) extends T_A[C]
case class CC_B[D](a: Int, b: T_B[D], c: (T_B[Byte],(Boolean,Boolean))) extends T_A[D]
case class CC_C[E](a: T_A[T_A[E]]) extends T_A[E]
case class CC_D() extends T_B[Byte]
case class CC_E(a: T_A[T_A[CC_D]], b: CC_D, c: (T_B[CC_D],CC_D)) extends T_B[Byte]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,_), _) => 0 
  case CC_A(CC_B(_, _, _), (_,_), _) => 1 
  case CC_A(CC_C(_), (_,_), _) => 2 
  case CC_B(_, _, (_,_)) => 3 
  case CC_C(CC_A(_, _, _)) => 4 
  case CC_C(CC_B(_, _, _)) => 5 
  case CC_C(CC_C(_)) => 6 
}
}