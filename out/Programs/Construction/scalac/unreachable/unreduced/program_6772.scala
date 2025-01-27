package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: (T_A,T_B[T_A, T_A]), c: T_A) extends T_A
case class CC_B(a: T_B[Boolean, Int], b: T_A) extends T_A
case class CC_C[C](a: CC_B) extends T_A
case class CC_D[D](a: Byte, b: Boolean, c: T_A) extends T_B[D, Byte]
case class CC_E[E](a: T_A, b: (T_B[Byte, Byte],CC_A)) extends T_B[E, Byte]
case class CC_F[F](a: F, b: F, c: CC_D[F]) extends T_B[F, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 0 
  case CC_A(CC_B(_, _), _, CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 1 
  case CC_A(CC_C(_), _, CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 2 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_B(_, _), (_,_), CC_A(_, _, _))) => 3 
  case CC_A(CC_B(_, _), _, CC_A(CC_B(_, _), (_,_), CC_A(_, _, _))) => 4 
  case CC_A(CC_C(_), _, CC_A(CC_B(_, _), (_,_), CC_A(_, _, _))) => 5 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_C(_), (_,_), CC_A(_, _, _))) => 6 
  case CC_A(CC_B(_, _), _, CC_A(CC_C(_), (_,_), CC_A(_, _, _))) => 7 
  case CC_A(CC_C(_), _, CC_A(CC_C(_), (_,_), CC_A(_, _, _))) => 8 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), (_,_), CC_B(_, _))) => 9 
  case CC_A(CC_B(_, _), _, CC_A(CC_A(_, _, _), (_,_), CC_B(_, _))) => 10 
  case CC_A(CC_C(_), _, CC_A(CC_A(_, _, _), (_,_), CC_B(_, _))) => 11 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_B(_, _), (_,_), CC_B(_, _))) => 12 
  case CC_A(CC_B(_, _), _, CC_A(CC_B(_, _), (_,_), CC_B(_, _))) => 13 
  case CC_A(CC_C(_), _, CC_A(CC_B(_, _), (_,_), CC_B(_, _))) => 14 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_C(_), (_,_), CC_B(_, _))) => 15 
  case CC_A(CC_B(_, _), _, CC_A(CC_C(_), (_,_), CC_B(_, _))) => 16 
  case CC_A(CC_C(_), _, CC_A(CC_C(_), (_,_), CC_B(_, _))) => 17 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), (_,_), CC_C(_))) => 18 
  case CC_A(CC_B(_, _), _, CC_A(CC_A(_, _, _), (_,_), CC_C(_))) => 19 
  case CC_A(CC_C(_), _, CC_A(CC_A(_, _, _), (_,_), CC_C(_))) => 20 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_B(_, _), (_,_), CC_C(_))) => 21 
  case CC_A(CC_B(_, _), _, CC_A(CC_B(_, _), (_,_), CC_C(_))) => 22 
  case CC_A(CC_C(_), _, CC_A(CC_B(_, _), (_,_), CC_C(_))) => 23 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_C(_), (_,_), CC_C(_))) => 24 
  case CC_A(CC_B(_, _), _, CC_A(CC_C(_), (_,_), CC_C(_))) => 25 
  case CC_A(CC_C(_), _, CC_A(CC_C(_), (_,_), CC_C(_))) => 26 
  case CC_A(CC_A(_, _, _), _, CC_B(_, CC_A(_, _, _))) => 27 
  case CC_A(CC_B(_, _), _, CC_B(_, CC_A(_, _, _))) => 28 
  case CC_A(CC_C(_), _, CC_B(_, CC_A(_, _, _))) => 29 
  case CC_A(CC_A(_, _, _), _, CC_B(_, CC_B(_, _))) => 30 
  case CC_A(CC_B(_, _), _, CC_B(_, CC_B(_, _))) => 31 
  case CC_A(CC_C(_), _, CC_B(_, CC_B(_, _))) => 32 
  case CC_A(CC_A(_, _, _), _, CC_B(_, CC_C(_))) => 33 
  case CC_A(CC_B(_, _), _, CC_B(_, CC_C(_))) => 34 
  case CC_A(CC_C(_), _, CC_B(_, CC_C(_))) => 35 
  case CC_A(CC_A(_, _, _), _, CC_C(_)) => 36 
  case CC_A(CC_B(_, _), _, CC_C(_)) => 37 
  case CC_A(CC_C(_), _, CC_C(_)) => 38 
  case CC_B(_, CC_A(CC_A(_, _, _), (_,_), _)) => 39 
  case CC_B(_, CC_A(CC_B(_, _), (_,_), _)) => 40 
  case CC_B(_, CC_A(CC_C(_), (_,_), _)) => 41 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 42 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 43 
  case CC_B(_, CC_B(_, CC_C(_))) => 44 
  case CC_B(_, CC_C(_)) => 45 
  case CC_C(_) => 46 
}
}