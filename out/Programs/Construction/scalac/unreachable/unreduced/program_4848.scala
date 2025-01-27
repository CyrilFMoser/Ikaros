package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: (T_A[Int],T_A[Char])) extends T_A[E]
case class CC_C[F, G]() extends T_B[Int, F]
case class CC_D[H](a: CC_C[H, H], b: T_A[H], c: T_A[T_B[H, H]]) extends T_B[Int, H]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_D(_, CC_A(_, CC_A(_, _, _), CC_B(_, _)), CC_A(_, _, _)) => 2 
  case CC_D(_, CC_A(_, CC_B(_, _), CC_A(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_D(_, CC_A(_, CC_B(_, _), CC_B(_, _)), CC_A(_, _, _)) => 4 
  case CC_D(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B(CC_A(_, _, _), (_,_))) => 5 
  case CC_D(_, CC_A(_, CC_A(_, _, _), CC_B(_, _)), CC_B(CC_A(_, _, _), (_,_))) => 6 
  case CC_D(_, CC_A(_, CC_B(_, _), CC_A(_, _, _)), CC_B(CC_A(_, _, _), (_,_))) => 7 
  case CC_D(_, CC_A(_, CC_B(_, _), CC_B(_, _)), CC_B(CC_A(_, _, _), (_,_))) => 8 
  case CC_D(_, CC_B(_, (_,_)), CC_B(CC_A(_, _, _), (_,_))) => 9 
  case CC_D(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B(CC_B(_, _), (_,_))) => 10 
  case CC_D(_, CC_A(_, CC_A(_, _, _), CC_B(_, _)), CC_B(CC_B(_, _), (_,_))) => 11 
  case CC_D(_, CC_A(_, CC_B(_, _), CC_A(_, _, _)), CC_B(CC_B(_, _), (_,_))) => 12 
  case CC_D(_, CC_A(_, CC_B(_, _), CC_B(_, _)), CC_B(CC_B(_, _), (_,_))) => 13 
  case CC_D(_, CC_B(_, (_,_)), CC_B(CC_B(_, _), (_,_))) => 14 
}
}
// This is not matched: CC_D(_, CC_B(_, (_,_)), CC_A(_, _, _))